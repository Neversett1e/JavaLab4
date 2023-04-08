import numpy as np
import matplotlib.pyplot as plt
import pandas as pd

x = np.array([-3, -2, -1, 0, 1, 2 ,3])
y = np.array([9, 4, 1, 0, 1, 4, 9])

fig, axes = plt.subplots(2,2)
axes[1,0].bar(x, y)
axes[1,1].plot(np.cos(y), x)
plt.show()
