# Problem: The Citadel's Alchemist - Summary and Logic

In last year's **ECPC**, I came across this problem. While there might be multiple ways to approach it, I’ll explain the logic I used to solve it during the contest.

---

### The Logic

The goal is to have as many numbers as possible that are divisible by **15**. We can combine any two numbers $x$ and $y$ into their product $x \times y$. 

A number is divisible by 15 if it is divisible by both **3** and **5** (since $15 = 3 \times 5$). 

#### My Approach:
1.  **Identify the "5"s:** I first count how many numbers in the collection are already divisible by **5**. These are our "base" components for making a 15.
2.  **Matching with "3"s:** For every number in the original list, I check if multiplying it by 5 would make it divisible by 15. Mathematically, this is checking if $(v[i] \times 5) \% 15 == 0$.
3.  **The Goal:** This condition essentially finds numbers that contain a factor of **3** (or are already 15). If a number has a 3, and we have an available "5" from our count, we can combine them to form a 15.
4.  **Greedy Count:** For every number that can complete a 15, I increment the answer and decrement my pool of "5"s.

