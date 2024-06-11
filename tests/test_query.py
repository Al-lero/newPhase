import unittest


class QueryTestCase(unittest.TestCase):

    def __init__(self, methodName: str = "runTest"):
        super().__init__(methodName)
        self.sl = None

        def setUp(self):
            self.sl.add_to_query("semicolon.africa")
            self.sl.add_to_query("google.com")
            self.sl.add_to_query("reuters.ng")
            self.sl.add_to_query("x.com")

    def test_if_query_can_add_element(self):
        self.assertEqual(len(self.sl.query), 1)  # add assertion here

    def test_if_query_can_remove_last_element(self):
        self.sl.pop()
        self.assertEqual(self.sl.stack[-1], "semicolol.africa")

if __name__ == '__main__':
    unittest.main()
