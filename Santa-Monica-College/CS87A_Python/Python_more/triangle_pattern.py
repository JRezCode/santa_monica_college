# This program displays a rectangular pattern of asterisks

base_size = int(input('How many rows? '))

for r in range(base_size):
    for c in range(r + 1):
        print('*', end='')
    print()
