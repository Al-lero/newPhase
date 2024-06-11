import unittest

import functions
functions.to_check_length


class MyTestCase(unittest.TestCase):
    def test_to_check_length(self):

        self.assertEqual(functions.to_check_length([]), 0) # add assertion here
        self.assertEqual(functions.to_check_length([1, 2, "alero"]), 3)

    def test_function_throws_expection(self):
        self.assertRaises(ValueError, functions.to_check_length, 0)

    def test_string_in_a_list(self):
        self.assertEqual(functions.to_check_length(["alero", "ope"]), 2)

    def test_string_in_list(self):
        self.assertEqual(functions.to_check_length(["utieyione@14"]), 1)

if __name__ == '__main__':
    unittest.main()
