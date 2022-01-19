package main

import (
	"bufio"
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
		fmt.Println(x, " can be fitted in:")
		if x >= -128 && x <= 127 {
			fmt.Println("* byte")
		}
		if x >= -32768 && x <= 32767 {
			fmt.Println("* short")
		}
		if x >= -2147483648 && x <= 2147483647 {
			fmt.Println("* int")
		}
		if x >= -9223372036854775808 && x <= 9223372036854775807 {
			fmt.Println("* long")
		} else {
			fmt.Println("Can't be fitted anywhere.")
		}
	}
}

func readLine(reader *bufio.Reader) string {
	str, _, err := reader.ReadLine()
	if err == io.EOF {
		return ""
	}

	return strings.TrimRight(string(str), "\r\n")
}
