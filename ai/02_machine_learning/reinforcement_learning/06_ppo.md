# Proximal Policy Optimization (PPO)

## 1. Key Idea

Instead of learning Q-values, PPO learns a **policy directly**.

π(a|s) → probability of action given state

## 2. Actor-Critic Architecture

* Actor → decides action
* Critic → evaluates action

## 3. Problem in Policy Gradient

Large updates can destabilize training.

## 4. PPO Solution (Clipping)

Objective:

L = min(
r(θ) * A,
clip(r(θ), 1-ε, 1+ε) * A
)

Where:
r(θ) = π_new / π_old

## 5. Advantage Function

A = Q(s,a) - V(s)

## 6. Why PPO Works

* Stable updates
* Easy to implement
* High performance

## 7. Used In

* OpenAI systems
* Robotics
* Game AI
