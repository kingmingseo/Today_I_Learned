x=c(1:10)
dotchart(x,label=paste("Test",1:10),pch=22)


x=c(1:9)
y=x*2
z=x*3
plot(1:10)
plot(x,y,type="o")
points(x,z,pch="+")
lines(x,z,col="blue")

dev.off()
