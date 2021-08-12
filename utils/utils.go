package utils

//检查错误信息
func CheckErr(err error)  {
	if err != nil {
		panic(err)
	}
}
