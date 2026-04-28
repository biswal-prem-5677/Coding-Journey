# Markov Decision Processes (MDP)

## 1. Definition

A Markov Decision Process (MDP) is a mathematical framework for modeling decision-making.

It consists of:

* S: Set of states
* A: Set of actions
* P: Transition probability function
* R: Reward function
* γ: Discount factor

## 2. Markov Property

The future depends only on the current state:
P(S_{t+1} | S_t)

## 3. Objective

Maximize expected cumulative reward.

## 4. Bellman Equation

V(s) = max_a [ R(s,a) + γ Σ P(s'|s,a) V(s') ]

## 5. Applications

* Robotics
* Game AI
* Recommendation systems
