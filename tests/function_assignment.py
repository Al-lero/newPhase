import random

def list_of_ten_numbers():
    random.seed(40)
    number = []
    number = random.sample(range(1,51), 10)
    return number

print(list_of_ten_numbers())
x = list_of_ten_numbers()

def get_length_of_list(x):
    counter = 0
    for count in x:
        counter += 1
    return counter

print(get_length_of_list(x))

def sum_element_at_even_position(x):
    sum = 0
    for index in range(0, get_length_of_list(x), 2):
        sum += x[index]
    return sum

print(sum_element_at_even_position(x))

def sum_element_at_odd_position(x):
    sum = 0
    for index in range(1, get_length_of_list(x),2):
        sum += x[index]
    return sum
print(sum_element_at_odd_position(x))


def multiply_element_at_third_position(x):
    multiply = 3
    for index in range(3,get_length_of_list(x), 3):
        multiply *= x[index]
    return multiply
print(multiply_element_at_third_position(x))


def sum_of_all_elements(x):
    sum = 0
    for index in range(0,get_length_of_list(x)):
        sum += x[index]
    return sum
print(sum_of_all_elements(x))

def average_of_all_elements(x):
    total = 0
    for index in range(0, get_length_of_list(x)):
        total += x[index]
        average = total / 2
    return average
print(average_of_all_elements(x))


def largest_element_in_list(x):
    largest = 0
    for index in x:
        if index > largest:
            largest = index
    return largest
print(largest_element_in_list(x))


def smallest_element_in_list(x):
    smallest = x[0]
    for index in x:
        if index < smallest:
            smallest = index
    return smallest
print(smallest_element_in_list(x))


def count_number_of_string(input):
    strings_count = 0
    character_count = 0
    for string in input:
        strings_count += 1
        for _ in string:
            character_count += 1
            if character_count > 2 and string[0] == string[-1]:
                return string
print(count_number_of_string(["aba", "abi", "semi"]))

def sequential_list():
    list = []

    for number in range(1,16):
        list.append(number)
    return list
print(sequential_list())


def duplicate_element_in_list():
    list = []
    for number in range(1,16):
        list.append(number)
        item = list
        collection = list + item
    return collection
print(duplicate_element_in_list())
old = duplicate_element_in_list()

def eliminate_duplicates_value():
    new_number = set()
    old_list = duplicate_element_in_list()
    for number in old_list:
        new_number.add(number)
    return new_number
print(eliminate_duplicates_value())


def add_every_third_element():
    new_list = [2,1,3,4,5,6,]
    sum = 0
    for index in range(2,get_length_of_list(new_list), 3):
        sum += new_list[index]
    return sum
print(add_every_third_element())

def sum_first_middle_last_element():
    list = [2,3,1,4,6,8,2]
    sum = 0
    first_element = list[0]
    second_element = list[get_length_of_list(list)// 2]
    third_element = list[-1]
    sum = first_element + second_element + third_element
    return sum
print(sum_first_middle_last_element())


def collect_new_collection():
    user_input = set()
    for _ in range(1,11):
         number = float(input("Enter a number: "))
         user_input.add(number)
    return list(user_input)
#print(collect_new_collection())

def sum_collection(collect_new_collection):
    total = 0
    number_set = collect_new_collection()
    for number in number_set:
        total += number
    return total
#print(sum_collection(collect_new_collection))


def remove_item():
    number_set = collect_new_collection()
    for number in number_set:
        number_set.remove(number)
        return number
    else:
        return None
#print(remove_item())


# def find_intersection():
#     total = {}
#     number_1 = {2,4,2,5,6,76,98}
#     number_2 = {3,1,2,5,46,87}
#     for number in number_1:
#         if number in number_2:
#             intersection.__add__(number)
#             total = intersection
#     return total
# print(find_intersection())


def create_union():
    number1 ={1,3,4,5,7}
    number2 = {0,6,5,1}
    join =  number1.union(number2)
    return join
print(create_union())


def first_set_subset():
    number1 = {1,3,4,5,7}
    number2 = {0,6,5,1,5,2,3}
    if number1 <= number2:
        return "number1 is a subset of number2"
    else:
        return "number1 is not a subset of number2 "
print(first_set_subset())


#def remove_all_element():

# def maximum_and_minimum():
#     number1 = {1, 3, 4, 5, 7}
#     number2 = {1, 6, 5, 1, 5, 2, 3}
#     maximum = 0
#     minimum = number2[0]
#
#     for index in number2:
#         if index > maximum:
#             maximum = index
#         elif index < minimum:
#             minimum = index
#     return maximum , minimum
# print(maximum_and_minimum())

def show_length():
    temp = {0,6,5,1,5,2}
    counter = 0
    for count in temp:
        counter += 1
    return counter
print(show_length())


def tupel_empty():
    temp = (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    sum = 0
    for index in range(1,get_length_of_list(temp),2):
        sum += temp[index]
    return sum
print(tupel_empty())

def sum_tupel_even_position():
    temp = (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    sum = 0
    for index in range(0, get_length_of_list(temp), 2):
        sum += temp[index]
    return sum
print(sum_tupel_even_position())


def smallest_and_highest_element_in_tuple():
    temp = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    highest = 0
    lowest = temp[0]
    for index in temp:
        if index > highest:
            highest = index
        elif index < lowest:
            lowest = index
    return highest , lowest
print(smallest_and_highest_element_in_tuple())

def unpack_five_element():
    temp = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    five_first_element = temp[:5]
    return five_first_element
print(unpack_five_element())


def empty_dicitionary():
    students = [
        {
            "name": "Alero",
            "age": 10,
        },
        {
            "name": "Esther",
            "age": 15,
        },
        {
            "name": "Ore",
             "age": 12,
        },
        {
            "name": "Blue",
            "age": 9,
        },
        {
            "name": "Ugo",
            "age": 11,
        },
        {
            "name": "Purple",
            "age": 15,
        },
        {
            "name":
        }
    ]

    return student
print(empty_dicitionary())

def display_dicitionary_by_key():
    student = {
        "Name": 'age',
        "Alero": 12,
        "Ore": 10,
        "Buchi": 8,
        "Eze": 9,
        "Jazz": 4,
        "Okrika": 5,
        "phel": 8,
        "zassy": 9,
        "Wine": 3,
        "Blue": 6
    }
    for key in student.items():
        return key
print(empty_dicitionary())








































