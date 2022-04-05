par("mar")

par(mar=c(1,1,1,1))


plot(10:1)
close.screen(all=TRUE)
split.screen(c(2,1))
split.screen(c(1,3),screen=2)
screen(1)
plot(10:1)
screen(4)
plot(1:10)
rm(list=ls())
