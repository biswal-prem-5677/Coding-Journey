# Reinforcement Learning - Markov Decision Processes

## Overview

This module implements a basic Markov Decision Process (MDP) and solves it using Value Iteration.

## Contents

* Theory of MDP
* Experiment notebook
* Value Iteration implementation

## Skills Demonstrated

* Reinforcement Learning fundamentals
* Bellman Equation
* Dynamic Programming

## Next Steps

* Policy Iteration
* Q-Learning
* Deep Q Networks (DQN)



## Added: Policy Iteration

Implemented full Policy Iteration pipeline:

* Policy Evaluation
* Policy Improvement
* Convergence detection

### Comparison

| Method           | Approach                    |
| ---------------- | --------------------------- |
| Value Iteration  | Direct optimization         |
| Policy Iteration | Iterative policy refinement |


## Added: Q-Learning (Model-Free RL)

Implemented:

* Q-table learning
* Epsilon-greedy strategy
* Temporal Difference (TD) update

### Key Advantage

No need for transition probabilities (model-free learning)

### Next Target

Deep Q Networks (DQN)


## Added: Deep Q Network (DQN)

Features:

* Neural network-based Q-function
* Experience replay buffer
* Target network stabilization

### Tech Stack

* PyTorch
* Reinforcement Learning
* Deep Learning

### Next Evolution

* Double DQN
* Dueling DQN
* PPO (Policy Gradient)

## Added: PPO (Policy Gradient RL)

Features:

* Actor-Critic architecture
* Clipped objective function
* Stable policy updates

### Why This Matters

PPO is used in real-world RL systems due to its stability and performance.

### Covered Concepts

* Policy gradients
* Advantage estimation
* Clipped surrogate objective

### Next Steps

* Generalized Advantage Estimation (GAE)
* Continuous action spaces
* RL environments (Gymnasium)

