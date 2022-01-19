package main

import (
	"bufio"
	"errors"
	"fmt"
	"io"
	"os"
	"strconv"
	"strings"
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	a, _ := strconv.Atoi(readLine(reader))

	for i := 0; i < a; i++ {

		x, _ := strconv.ParseFloat(readLine(reader), 64)
		result, err := checkDataType(x)
		if err != nil {
			for _, v := range result {
				format := fmt.Sprint(x, v)
				fmt.Println(format)
				return
			}
		}

		for _, v := range result {
			fmt.Println(v)
		}
	}
}

func checkDataType(x float64) ([]string, error) {
	var dataTypeSucess []string
	var dataTypeError []string
	xToString := fmt.Sprint(x)
	stringFormat := fmt.Sprint(xToString, " can be fitted in:")
	dataTypeSucess = append(dataTypeSucess, stringFormat)

	if x >= -128 && x <= 127 {
		dataTypeSucess = append(dataTypeSucess, "* byte")
	}
	if x >= -32768 && x <= 32767 {
		dataTypeSucess = append(dataTypeSucess, "* short")
	}
	if x >= -2147483648 && x <= 2147483647 {
		dataTypeSucess = append(dataTypeSucess, "* int")
	}
	if x >= -9223372036854775808 && x <= 9223372036854775807 {
		dataTypeSucess = append(dataTypeSucess, "* long")
	} else {
		stringFormatError := fmt.Sprint(" can't be fitted anywhere.")
		dataTypeError = append(dataTypeError, stringFormatError)
		return dataTypeError, errors.New("Error")
	}
	return dataTypeSucess, nil
}

func readLine(reader *bufio.Reader) string {
	str, _, err := reader.ReadLine()
	if err == io.EOF {
		return ""
	}

	return strings.TrimRight(string(str), "\r\n")
}
