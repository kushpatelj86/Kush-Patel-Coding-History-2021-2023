from contextlib import contextmanager

@contextmanager
def open_managed_file(filename):
    f = open(filename,'w')
    try:
        yield f
    finally:
        f.close()

with open_managed_file("1.txt") as f:
    f.write('some todoo...')