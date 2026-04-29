# Deep Q Network (DQN)

## 1. Problem with Q-Learning

Q-table does not scale for large state spaces.

## 2. Solution

Use a Neural Network to approximate Q(s, a)

## 3. Architecture

Input: State
Output: Q-values for each action

## 4. Key Components

### Experience Replay

Stores past experiences:
(s, a, r, s')

Breaks correlation between samples.

### Target Network

Separate network for stable learning.

## 5. Loss Function

L = (r + γ max Q_target(s', a') - Q(s, a))²

## 6. Training Steps

1. Observe state
2. Choose action (ε-greedy)
3. Store experience
4. Sample batch
5. Train network
6. Update target network

## 7. Applications

* Atari games (DeepMind)
* Autonomous systems
* Robotics control
