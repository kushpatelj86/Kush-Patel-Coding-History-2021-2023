file = open('1.txt', 'w')

try:
    file.write('some todo...')
finally:
    file.close()