# Problem: I'll Be There For Youuuu 

The problem asks us to simulate Phoebe's clapping pattern over a period of $N$ seconds. She follows a specific sequence but must skip certain beats based on a "rest" rule.

---

### Logic

1.  **The Clapping Sequence:**
    Phoebe attempts to clap starting at second 1 and continues every $K$ seconds. This forms an Arithmetic Progression: $1, 1+K, 1+2K, 1+3K, \dots$ as long as the time is less than or equal to $N$.

2.  **The Rest Rule:**
    Phoebe cannot clap if the current second is a multiple of $M$. In programming, we check this using the modulo operator: if `second % M == 0`, she must stay silent.

3.  **The Task:**
    * Iterate through the sequence starting from 1, incrementing by $K$ each time, until you exceed $N$.
    * For each step, check if the current second is NOT divisible by $M$.
    * If it's valid: increment your clap counter and store this second as the "last clap."
    * If the counter remains 0 after the loop, output `0 -1`.


