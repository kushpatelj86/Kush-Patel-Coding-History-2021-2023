class ManagedFile:
    def __init__(self, filename):
        print('init')
        self.filename = filename

    def __enter__(self):
        print('enter')
        self.file = open(self.filename, 'w')
        return self.file


    def __exit__(self,exc_type,exc_value,exc_traceback):
        if self.file:
            self.file.close()
        if exc_type is not None:
            print('exception has been handled')
        print('exit')
        return True



with ManagedFile('1.txt') as file:
    print('do some stuff')
    file.write('some todoo...')
print('continuing')