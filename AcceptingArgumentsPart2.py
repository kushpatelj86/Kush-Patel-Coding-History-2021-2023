#Accepting Arguments Part 2
import argparse


parser = argparse.ArgumentParser( description='This program prints the name of my dogs')


parser.add_argument('-c','--color', metavar='color',required=True,help='the color to search for')


args = parser.parse_args()


print(args.color)















