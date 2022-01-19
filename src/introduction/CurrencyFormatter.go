package main

func main() {
	// for _, iso := range []string{"USD", "BRL", "EUR", "JPY", "INR"} {
	// 	cur := currency.MustParseISO(iso)
	// 	scale, _ := currency.Cash.Rounding(cur) // fractional digits
	// 	dec := number.Decimal(100000.00, number.Scale(scale))
	// 	p := message.NewPrinter(language.English)
	// 	p.Printf("%v: %v%v\n", cur, currency.Symbol(cur), dec)
	// }

	// USD: $100,000.00
	// BRL: R$100,000.00
	// EUR: €100,000.00
	// JPY: ¥100,000
	// INR: ₹100,000.00

	// https://stackoverflow.com/questions/47801050/currency-format-in-golang-using-currency-symbol-from-golang-org-x-text-currency
}
