import speedtest

speed = speedtest.Speedtest()

def byteToMegabyte(bytes):
    KB = 1024
    MB = KB * 1024
    return int(bytes/MB)


result = byteToMegabyte(speed.download())



print("Your download speed is ", result, "MB")