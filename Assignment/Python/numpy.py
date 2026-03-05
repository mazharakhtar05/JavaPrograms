#calculate the mean and standard deviation coloumn wise 5X5 large values
import numpy as np 
import random
data = np.random.rand(5, 5) * 1000000

print("Original 5x5 array with large values:")
print(data)
print("\n")

mean_columns = np.mean(data, axis=0)
print("Mean of each column:")
print(mean_columns)
print("\n")

std_dev_columns = np.std(data, axis=0)
print("Standard deviation of each column:")
print(std_dev_columns)

#Given