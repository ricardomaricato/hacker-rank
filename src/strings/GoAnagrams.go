package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	reader := bufio.NewScanner(os.Stdin)
	var a string
	for {
		reader.Scan()
		a := reader.Text()
		b := reader.Text()
	}

	if len(a) < 1 || len(a) > 50 || len(b) < 1 || len(b) > 50 {
		fmt.Println("Input not allowed")
		return
	}
}
