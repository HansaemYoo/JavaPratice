print("a" + "b") # ab
print("a", "b") # a b

print("나는 %d살입니다." %20)
print("나는 %s을 좋아해요." %"파이썬")
print("Apple은 %c로 시작해요." %"A")
print("나는 %s과 %s을 좋아해요." %("치킨", "초밥"))

print("나는 {}살 입니다.".format(20))
print("나는 {}과 {}을 좋아해요.".format("치킨", "초밥"))

print("나는 {age}살이며, {food}을 좋아해요.".format(age = 20, food = "치킨"))

age = 20
food = "치킨"
print(f"나는 {age}살이며, \n\"{food}\"을 좋아해요.".format(age, food))