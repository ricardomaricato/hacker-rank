package main

import (
	"bufio"
	"fmt"
	"io"
	"os"
	"reflect"
	"strings"
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	a := readLine(reader)
	b := readLine(reader)

	if len(a) < 1 || len(a) > 50 || len(b) < 1 || len(b) > 50 {
		fmt.Println("Input not allowed")
		return
	}

	if isAnagram(a, b) {
		fmt.Println("Anagrams")
		return
	}

	fmt.Println("Not Anagrams")
}

func isAnagram(a, b string) bool {
	if len(a) != len(b) {
		return false
	}

	aLowerCase := strings.ToLower(a)
	bLowerCase := strings.ToLower(b)

	aCharCountMap := make(map[string]int)
	strArray := []rune(aLowerCase)

	for i := 0; i < len(strArray); i++ {
		char := string(strArray[i])
		if v, exists := aCharCountMap[char]; exists {
			aCharCountMap[char] = v + 1
		} else {
			aCharCountMap[char] = 1
		}
	}

	bCharCountMap := make(map[string]int)
	strArray2 := []rune(bLowerCase)

	for i := 0; i < len(strArray2); i++ {
		char := string(strArray2[i])
		if v, exists := bCharCountMap[char]; exists {
			bCharCountMap[char] = v + 1
		} else {
			bCharCountMap[char] = 1
		}
	}

	return reflect.DeepEqual(aCharCountMap, bCharCountMap)
}

func readLine(reader *bufio.Reader) string {
	str, _, err := reader.ReadLine()
	if err == io.EOF {
		return ""
	}

	return strings.TrimRight(string(str), "\r\n")
}
