package main

import (
	"fmt"
	"strconv"
	"strings"
)

func main() {
	A := "5 2 4 6 1 3"

	strs := strings.Split(A, " ")
	ary := make([]int, len(strs))
	for i := range ary {
		ary[i], _ = strconv.Atoi(strs[i])
	}

	fmt.Println(ary)
}
