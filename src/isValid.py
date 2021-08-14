class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        rnd = 0
        sq = 0
        curl = 0
        for c in s:
            if c == '(':
                rnd += 1
            elif c == ')':
                rnd -= 1
            elif c == '[':
                sq += 1
            elif c == ']':
                sq -= 1
            elif c == '{':
                curl += 1
            elif c == '}':
                curl -= 1
            if (rnd < 0 or sq < 0 or curl < 0):
                return False
        return True