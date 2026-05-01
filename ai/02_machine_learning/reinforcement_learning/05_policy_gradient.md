# Policy Gradient (REINFORCE)

## 1. Idea

Instead of learning value/Q, directly learn policy:

π(a|s; θ)

## 2. Objective

Maximize expected reward:

J(θ) = E[ log π(a|s) * R ]

## 3. Update Rule

θ = θ + α ∇ log π(a|s) * R

## 4. Key Insight

* Increase probability of good actions
* Decrease probability of bad actions

## 5. Problem

* High variance
* Slow convergence

## 6. Solution (next step)

→ Actor-Critic (reduces variance)
→ PPO (stability)

## 7. Why Important

This is the foundation of:

* PPO
* A2C/A3C
* Modern RL systems
