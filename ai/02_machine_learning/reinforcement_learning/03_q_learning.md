# Q-Learning (Model-Free Reinforcement Learning)

## 1. Definition

Q-Learning is a model-free algorithm that learns the optimal action-value function.

## 2. Q-Function

Q(s, a): expected reward for taking action a in state s

## 3. Update Rule

Q(s,a) = Q(s,a) + α [ r + γ max_a' Q(s',a') - Q(s,a) ]

## 4. Key Parameters

* α (learning rate)
* γ (discount factor)
* ε (exploration rate)

## 5. Exploration vs Exploitation

* Exploration: try new actions
* Exploitation: use learned values

## 6. Epsilon-Greedy Strategy

With probability ε → random action
With probability (1-ε) → best action

## 7. Applications

* Game AI (Atari, Chess variants)
* Robotics
* Dynamic pricing
