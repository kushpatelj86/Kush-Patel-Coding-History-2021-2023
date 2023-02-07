from multiprocessing import Process
import os
import time

def square_numbers():
    for i in range(1000):
        i * i


if __name__ == '__main__':
    processes = []
    num_processes = os.cpu_count()
    #number of CPUs on the machine. Usually a good choice for the number of processes

#create processers and assign a function for each process
for i in range(num_processes):
    p = Process(target=square_numbers)
    processes.append(p)


#start all processes
for p in processes:
    p.start()


#wait for all processes to finish
for p in processes:
    p.join()














