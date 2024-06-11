  collection = [2, 3, 5, 3, 3, 2, 5]


def check_number_of_occurence(collection):
    counter = {}
    for number in collection:
        counter[number] = counter.get(number, 0) + 1
    return counter


print(check_number_of_occurence(collection))

