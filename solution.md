Observation
If every element of the matrix is x, then each element of A^p becomes:
n^(p-1) * x^p
Total elements = n^2
So the sum becomes:
n^2 * n^(p-1) * x^p= n^(p+1) * x^p
Use fast exponentiation to compute this under modulo 10^9+7.
Time Complexity: O(log p)
Space Complexity: O(1)
