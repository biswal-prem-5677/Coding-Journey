# Bellman Equation & Policy Iteration

## 1. Bellman Expectation Equation

For a given policy π:

V(s) = Σ π(a|s) [ R(s,a) + γ Σ P(s'|s,a) V(s') ]

## 2. Bellman Optimality Equation

V*(s) = max_a [ R(s,a) + γ Σ P(s'|s,a) V*(s') ]

## 3. Policy Iteration

Steps:

1. Initialize random policy π
2. Policy Evaluation:
   Compute V(s) for current policy
3. Policy Improvement:
   Update policy using:
   π(s) = argmax_a [ R + γV ]
4. Repeat until convergence

## 4. Key Insight

* Value Iteration → directly optimal values
* Policy Iteration → improves policy step-by-step

## 5. Use Cases

* Autonomous systems
* Resource optimization
* Game decision engines
