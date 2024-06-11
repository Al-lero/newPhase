import unittest

import js_task
from js_task import check_number_of_occurence


class JsTaskCase(unittest.TestCase):
    def test_s(self):
        answer = {2: 2, 3: 3, 5: 2}
        self.assertEqual(answer, js_task.check_number_of_occurence([2, 3, 5, 3, 3, 2, 5]))  # add assertion here


if __name__ == '__main__':
    unittest.main()
