class Solution {
public:
    vector<string> generateParenthesis(int n) {
        vector<string> res;
        string s;
        helper(res, s, 0, 0, n);
        return res;
    }

    void helper(vector<string>& res, string& s, int left, int right, int n) {
        if (left == n && right == n) {
            res.push_back(s);
            return;
        }
        if (left < n) {
            s += '(';
            helper(res, s, left + 1, right, n);
            s.pop_back();
        }
        if (right < left) {
            s += ')';
            helper(res, s, left, right + 1, n);
            s.pop_back();
        }
    }
};