from multiprocessing import Pool


def cube(number):
    return number * number * number

if __name__ == '__main__':

    numbers = range(10)
    pool = Pool()

    #map,  , close
    result = pool.map(cube,numbers)


    pool.close()
    print(result)




