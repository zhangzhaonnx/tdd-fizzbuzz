# TDD FizzBuzz

## 需求

你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有N名学生在上课。游戏的规则是：
1. 让所有学生排成一队，然后按顺序报数。
2. 学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz；如果所报数字是5的倍数，那么要说Buzz；如果所报数字是第7的倍数，那么要说Whizz。
3. 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。
4. 学生报数时，如果所报数字包含了3，那么也不能说该数字，而是要说相应的单词，比如要报13的同学应该说Fizz。
5. 如果数字中包含了3，那么忽略规则2和规则3，比如要报30的同学只报Fizz，不报FizzBuzz。

## Tasking
// 规则1
1. Given 普通数字，When 报数，Then 显示该数字 
// 规则2
2. Given 数字是3的倍数，When 报数，Then 显示 Fizz
3. Given 数字是5的倍数，When 报数，Then 显示 Buzz
4. Given 数字是7的倍数，When 报数，Then 显示 Whizz
// 规则3
5. Given 数字是3和5的倍数，When 报数，Then 显示 FizzBuzz
6. Given 数字是3和7的倍数，When 报数，Then 显示 FizzWhizz
7. Given 数字是5和7的倍数，When 报数，Then 显示 BuzzWhizz
8. Given 数字是3和5和7的倍数，When 报数，Then 显示 FizzBuzzWhizz
// 规则4
9. Given 数字包含了3，When 报数，Then 显示 Fizz
// 规则5
10. Given 数字包含了3，且是3的倍数，When 报数，Then 显示 Fizz
11. Given 数字包含了3，且是5的倍数，When 报数，Then 显示 Fizz
12. Given 数字包含了3，且是7的倍数，When 报数，Then 显示 Fizz
13. Given 数字包含了3，且是3和5的倍数，When 报数，Then 显示 Fizz
14. Given 数字包含了3，且是3和7的倍数，When 报数，Then 显示 Fizz
15. Given 数字包含了3，且是5和7的倍数，When 报数，Then 显示 Fizz
16. Given 数字包含了3，且是3和5和7的倍数，When 报数，Then 显示 Fizz
