from turtle import pd

print('Alero, welcome to python')

tuple1 = (1,3,2.5,"alero")
print(tuple1[0])

tuple1 = (0,"alero",3.5,[])
tuple1[3].extend([1,3,"kemi"])
#print(tuple)
tuple1 = tuple1 + (1,6)
tuple1 += (1,8)
print(tuple1)

names = ["richness","adediran","leonard"]
names += tuple1
print(tuple(names))
print(names.index("alero"))

#
#SET
x = {7,2,1,5,1,5,3,"mercy"}
y = {1,4,3,9,8}
x.add(20)
print(x.difference(y))
print(x.union(y))
len(set(x))
print(len(set(x)))

list = [2,3,5,3,3,2,5]
#count = pd.Series(list).value_counts()
#print(len{list})
print(list.count(list[2]))
print(list.count(list[3]))
print(list.count(list[5]))
#print("Element count")
#print(count)


#Dictionary

country_code = {
    "NG" : "234",
    "US" : 1,
    "UK" : 43
}
print(country_code)
for key, value in country_code.items():
    print(key, value)

#To chnage the value of the key

country_code["UK"] = 44
print(country_code)

#getting length of a dictionary

name_called = {
    "Alero",
    "Ola",
    "Ada"
}
print(name_called)
print(len(name_called))


country = {
    "NG" : "234",
    "US" : 1,
    "UK" : 43
}
print(country)
for key, value in country.items():
    print(key, value)




