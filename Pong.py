import turtle as t


playerScore = 0
computerScore = 0





screen = t.Screen()

screen.title("Pong Game")

screen.bgcolor("green")

screen.setup(width=800,height=600)
screen.tracer(0)



#creating the player paddle




playerPaddle = t.Turtle()
playerPaddle.speed(0)
playerPaddle.shape("square")
playerPaddle.color("white")
playerPaddle.shapesize(stretch_wid=5,stretch_len=1)
playerPaddle.penup()
playerPaddle.goto(-350.00)




#creating the computer paddle
computerPaddle = t.Turtle()
computerPaddle.speed(0)
computerPaddle.shape("square")
computerPaddle.color("white")
computerPaddle.shapesize(stretch_wid=5,stretch_len=1)
computerPaddle.penup()
computerPaddle.goto(350.00)


#creating the ball

ball = t.Turtle()
ball.speed(0)
ball.shape("circle")
ball.color("red")
ball.penup()
ball.goto(5.5)
ballxdirection=0.2
ballydirection=0.2





#creating pen for scorecard updare
pen = t.Turtle()
pen.color("blue")
pen.speed(0)
pen.penup()
pen.hideturtle()
pen.goto(0,260)
pen.write("score", align="center",font=('Arial',24,'normal'))

#moving player paddle
def playerPaddleUp():
    y = playerPaddle.ycor()
    y=y+90
    playerPaddle.sety(y)

def playerPaddleDown():
    y = playerPaddle.ycor()
    y=y-90
    playerPaddle.sety(y)




#moving computer paddle
def computerPaddleUp():
    y = computerPaddle.ycor()
    y=y+90
    computerPaddle.sety(y)

def computerPaddleDown():
    y = computerPaddle.ycor()
    y=y-90
    computerPaddle.sety(y)





#assign kets to play

screen.listen()
screen.onkeypress(playerPaddleUp(),'w')
screen.onkeypress(playerPaddleUp(),'s')
screen.onkeypress(computerPaddleUp(),'Up')
screen.onkeypress(computerPaddleUp(),'Down')





while True:
    screen.update()



    #moving the ball

    ball.setx(ball.xcor + ballxdirection)
    ball.sety(ball.ycor + ballydirection)


    if ball.ycor() > 290:
        ball.sety(290)
        ballydirection=ballydirection*-1

    if ball.ycor() < -290:
        ball.sety(-290)
        ballydirection=ballydirection*-1


    if ball.xcor() > 390:
        ball.goto(0,0)
        ballxdirection = ballxdirection
        playerScore = playerScore + 1
        pen.clear()
        pen.write("player:{}     computer:{}".format(playerScore,computerScore),align='center',font=('Arial',24,'Normal'))
    
    if ball.xcor() < -390:
        ball.goto(0,0)
        ballxdirection = ballxdirection * -1
        playerScore = playerScore + 1
        pen.clear()
        pen.write("player:{}     computer:{}".format(playerScore,computerScore),align='center',font=('Arial',24,'Normal'))



    if (ball.xcor() > 340) and (ball.xcor() < 350) and (ball.ycor() < computerPaddle.ycor() + 40 and ball.ycor() > computerPaddle.ycor() - 40):
        ball.setx(340)
        ballxdirection = ballxdirection * -1


    if (ball.xcor() < -340) and (ball.xcor() > -350) and (ball.ycor() < playerPaddle.ycor() + 40 and ball.ycor() > playerPaddle.ycor() - 40):
        ball.setx(-340)
        ballxdirection = ballxdirection * -1












