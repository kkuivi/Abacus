# Abacus Problem (SRM 292)

An abacus can be used to do arithmetic. The version that we have has 6 horizontal threads, each with nine beads on it. The beads on each thread are always arranged with just one gap, possibly at one of the ends. However many beads are adjacent and at the right end of the thread is the digit value of the thread. The value on the abacus is read by taking the digits in order from top thread to bottom thread and arranging them from left to right (so the top thread is the one that contains the most significant digit).
Create a class Abacus that contains a method add that is given a String[] original and a number val and that returns a String[] showing the abacus after val has been added to the original abacus.

Both in original and in the return, the String[] will contain exactly 6 elements representing the 6 threads in order from top thread to bottom thread. Each element will contain a lowercase 'o' to represent each bead and three consecutive hyphens '-' to indicate the empty part of the thread. Each element will thus contain exactly 12 characters.

#Examples
0)
{"ooo---oooooo", "---ooooooooo", "---ooooooooo", "---ooooooooo", "oo---ooooooo", "---ooooooooo"}
5
Returns: {"ooo---oooooo", "---ooooooooo", "---ooooooooo", "---ooooooooo", "o---oooooooo", "ooooo---oooo" }
When we add 5 to the original, it is necessary to "carry" 1 to the next thread up. This shows the arithmetic 699979 + 5 = 699984

1)
{"ooo---oooooo", "---ooooooooo", "---ooooooooo", "---ooooooooo", "oo---ooooooo", "---ooooooooo"}
21
Returns: {"oo---ooooooo", "ooooooooo---", "ooooooooo---", "ooooooooo---", "ooooooooo---", "ooooooooo---" }
This shows 699979 + 21 = 700000

2)
{"ooooooooo---", "---ooooooooo", "ooooooooo---", "---ooooooooo", "oo---ooooooo", "---ooooooooo"}
100000
Returns: {"oooooooo---o", "---ooooooooo", "ooooooooo---", "---ooooooooo", "oo---ooooooo", "---ooooooooo" }


3)
{"o---oooooooo", "---ooooooooo", "---ooooooooo", "---ooooooooo", "---ooooooooo", "---ooooooooo" }
1
Returns: {"---ooooooooo", "ooooooooo---", "ooooooooo---", "ooooooooo---", "ooooooooo---", "ooooooooo---" }
