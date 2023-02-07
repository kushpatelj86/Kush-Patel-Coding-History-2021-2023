class CountCalls:
    def __init__(self,func):
        self.func = func
        self.num_calls = 0
    def __call__(self, *args, **kwargs):
        print("Hi there")





cc = CountCalls(None)
cc()

@CountCalls #class decroates
def say_hello():
    print("Hello")