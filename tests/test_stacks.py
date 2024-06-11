import unittest
from samples import MyStack


class StackTestCase(unittest.TestCase):

    def __init__(self, methodName: str = "runTest"):
        super().__init__(methodName)
        self.s1 = None

    def setUp(self):

        self.s1.add_to_stack("semicolon.africa")
        self.s1.add_to_stack("google.com")
        self.s1.add_to_stack("reuters.ng")
        self.s1.add_to_stack("x.com")

    def test_stack_can_add_element(self):
        self.assertEqual(len(self.s1.stack),4)

    def test_that_stack_removes_last_in_element(self):

        self.s1.pop()
        self.assertEqual(self.s1.stack[-1], "reuters.ng")


if __name__ == '__main__':
    unittest.main()
