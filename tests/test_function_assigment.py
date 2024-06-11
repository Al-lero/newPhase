import unittest
from function_assignment import list_of_ten_numbers, get_length_of_list, sum_element_at_even_position, \
    sum_element_at_odd_position, multiply_element_at_third_position, sum_of_all_elements, average_of_all_elements, \
    largest_element_in_list, smallest_element_in_list, count_number_of_string, duplicate_element_in_list, \
    sequential_list, eliminate_duplicates_value, add_every_third_element, sum_first_middle_last_element, \
    collect_new_collection, sum_collection, remove_item, create_union, first_set_subset, show_length, tupel_empty, \
    sum_tupel_even_position, smallest_and_highest_element_in_tuple, unpack_five_element, empty_dicitionary


class MyTestCase(unittest.TestCase):
    def test_list_of_ten_numbers(self):
        self.assertEqual(list_of_ten_numbers(), [30, 38, 34, 3, 16, 19, 43, 41, 14, 9])


    def test_get_length_of_list(self):
        x = [1,2,3,4,5,6,7,8,9,0]
        self.assertEqual(get_length_of_list(x), 10)

    def test_sum_element_at_even_position(self):
        x = [30, 38, 34, 3, 16, 19, 43, 41, 14, 9]
        self.assertEqual(sum_element_at_even_position(x), 137)


    def test_sum_element_at_odd_position(self):
        x = [30, 38, 34, 3, 16, 19, 43, 41, 14, 9]
        self.assertEqual(sum_element_at_odd_position(x), 110)

    def test_multiply_element_at_third_position(self):
        x = [30, 38, 34, 3, 16, 19, 43, 41, 14, 9]
        self.assertEqual(multiply_element_at_third_position(x), 3483)

    def test_sum_of_all_elements_(self):
        x = [30, 38, 34, 3, 16, 19, 43, 41, 14, 9]
        self.assertEqual(sum_of_all_elements(x), 247)

    def test_average_of_all_elements(self):
        x = [30, 38, 34, 3, 16, 19, 43, 41, 14, 9]
        self.assertEqual(average_of_all_elements(x),123.5)

    def test_largest_element_in_list(self):
        x = [30, 38, 34, 3, 16, 19, 43, 41, 14, 9]
        self.assertEqual(largest_element_in_list(x), 43)


    def test_smallest_element_in_list(self):
        x = [30, 38, 34, 3, 16, 19, 43, 41, 14, 9]
        self.assertEqual(smallest_element_in_list(x), 3)


    def test_count_number_of_string(self):
        self.assertEqual(count_number_of_string(["aba", "abi", "semi"]), "aba")

    def test_sequential_list(self):
        yas = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]
        self.assertEqual(sequential_list(), yas)
    def test_duplicate_element_in_list(self):
        list = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]
        item = list
        collection = list + item
        self.assertEqual(duplicate_element_in_list(), collection)


    def test_eliminate_duplicates_value(self):
        old_list = duplicate_element_in_list()
        new_number = set(duplicate_element_in_list())
        self.assertEqual(eliminate_duplicates_value(), new_number)


    def test_add_every_third_element(self):
        collect = [2,1,3,4,5,6]
        self.assertEqual(add_every_third_element(), 9)


    def test_sum_first_middle_last_element(self):
        collect = [2,3,1,4,6,8,2]
        self.assertEqual(sum_first_middle_last_element(), 8)


    def test_collect_new_collection(self):
        number = [32,12,45,56,12,45,65,12,67,12]
        self.assertEqual(collect_new_collection(),[32.0, 65.0, 67.0, 12.0, 45.0, 56.0])


    def test_sum_collection(self):
        number  = {32,12,45,56,12,45,65,12,67,12}
        self.assertEqual(sum_collection(),277 )

    def test_remove_item(self):
         number = {32,12,45,56,12,45,65,12,67,12}
         self.assertEqual(remove_item(), 32)

    #def test_find_intersection(self):


    def test_create_union(self):
        number1 = {1,3,4,5,7}
        number2 = {0,6,5,1}
        self.assertEqual(create_union(),{0, 1, 3, 4, 5, 6, 7})


    def test_first_set_subset(self):
        number1 = {1, 3, 4, 5, 7}
        number2 = {0, 6, 5, 1, 5, 2, 3}
        self.assertEqual(first_set_subset(),"number1 is not a subset of number2 " )

    # test_remove_all_element(self):
    # test_maximum_and_minimum(self):

    def test_show_length(self):
        temp = {0, 6, 5, 1, 5, 2}
        self.assertEqual(show_length(), 5)

    def test_tupel_empty(self):
        temp =  (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
        self.assertEqual(tupel_empty(),110)


    def test_sum_tupel_even_position(self):
        temp = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
        self.assertEqual(sum_tupel_even_position(), 100)


    def test_smallest_and_highest_element_in_tuple(self):
        tempt = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
        self.assertEqual(smallest_and_highest_element_in_tuple(), (20,1))


    def test_unpack_five_element(self):
        tempt = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
        self.assertEqual(unpack_five_element(), (1,2,3,4,5))


    def test_empty_dictionary(self):
        student = {
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
        self.assertEqual(empty_dicitionary(),
{'Alero': 12, 'Ore': 10, 'Buchi': 8, 'Eze': 9, 'Jazz': 4, 'Okrika': 5, 'phel': 8, 'zassy': 9, 'Wine': 3, 'Blue': 6}
)


if __name__ == '__main__':
    unittest.main()
