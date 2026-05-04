# 🧠 Unsupervised Learning — Machine Learning

This module is part of the **AI Roadmap → Machine Learning** track in the `Coding-Journey` repository.

It focuses on extracting **hidden patterns, structures, and representations** from unlabeled data using clustering and dimensionality reduction techniques.

---

## 📌 Objective

- Understand how machines learn **without labeled data**
- Discover hidden structures and patterns in datasets
- Learn clustering and representation learning techniques
- Analyze algorithm behavior in real-world scenarios
- Build strong intuition for data exploration and preprocessing

---

## 🗂️ Folder Structure


unsupervised/
│
├── 01_kmeans.md
├── 02_hierarchical_clustering.md
├── 03_dbscan_gmm.md
│
├── clustering/
│ └── experiment_.ipynb
│
├── dimensionality_reduction/
│ ├── 01_pca.md
│ ├── 02_tsne.md
│ ├── 03_autoencoders.md
│ └── experiment_.ipynb
│
├── experiment_*.ipynb
│
└── README.md


---

## 📚 Core Concepts

### 🔹 Clustering

#### 1. K-Means
- Centroid-based clustering
- Iterative optimization (assignment + update)
- Sensitive to initialization and scaling

#### 2. Hierarchical Clustering
- Agglomerative approach
- Dendrogram-based cluster formation
- No need to predefine cluster count

#### 3. DBSCAN & GMM
- DBSCAN:
  - Density-based clustering
  - Detects noise and arbitrary shapes
- Gaussian Mixture Models (GMM):
  - Probabilistic clustering
  - Soft cluster assignments

---

### 🔹 Dimensionality Reduction

#### 1. PCA (Principal Component Analysis)
- Linear dimensionality reduction
- Maximizes variance
- Eigen decomposition / SVD-based

#### 2. t-SNE
- Non-linear dimensionality reduction
- Preserves local structure
- Used for visualization

#### 3. Autoencoders
- Neural network-based compression
- Learns latent representations
- Foundation for deep representation learning

---

## 🧪 Experiments

All experiments follow:

> Hypothesis → Implementation → Observation → Insight

### Covered Experiments

#### 🔹 Clustering
- K-Means clustering (sklearn implementation)
- K-Means vs DBSCAN comparison
- Customer segmentation analysis

#### 🔹 Dimensionality Reduction
- PCA variance analysis
- PCA + clustering integration
- Visualization in reduced dimensions

#### 🔹 Combined Learning
- Clustering + classification pipeline experiments
- Feature space transformation impact

---

## 🧠 Learning Approach

### ❌ Avoid
- Blind clustering without interpretation
- Treating clusters as ground truth
- Using algorithms without understanding assumptions

### ✅ Focus
- Understanding distance vs density vs probability
- Interpreting cluster quality
- Visualizing data transformations
- Comparing methods deeply
- Studying failure cases

---

## ⚙️ Tech Stack

- Python
- NumPy
- Pandas
- Scikit-learn
- Matplotlib
- Jupyter Notebook

---

## 📊 Outcomes

By completing this module, you will:

- Understand unsupervised learning fundamentals
- Be able to explore and structure raw data
- Choose appropriate clustering techniques
- Apply dimensionality reduction effectively
- Build better preprocessing pipelines for ML systems

---

## 🚀 Next Steps

Continue the roadmap:


deep_learning/
generative_ai/
ai_systems/


---

## 🧭 Repository Principles

- Experiments = learning artifacts
- Projects = proof of capability
- Structure = clarity
- Naming = discipline
- GitHub = signal of expertise
