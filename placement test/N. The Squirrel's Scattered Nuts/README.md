# Problem: The Squirrel's Scattered Nuts

The squirrel needs to find two different nuts whose combined energy values result in an **odd sum**. Out of all possible pairs that make an odd sum, we need to find the **maximum** one.

---

### The Logic

To solve this problem efficiently, we need to understand a basic rule of arithmetic regarding odd and even numbers:

* **Even + Even = Even**
* **Odd + Odd = Even**
* **Odd + Even = Odd**

This means that to get an **odd sum**, you must pick exactly **one odd number** and **one even number**.

#### The Strategy
Since we want the **largest** possible odd sum, we don't need to check every single pair (which would be too slow). Instead:
1.  Find the **largest odd number** in the array.
2.  Find the **largest even number** in the array.
3.  If both exist, their sum is the largest possible odd sum.
4.  If the array contains only even numbers or only odd numbers, it is impossible to form an odd sum. In this case, output `-1`.


