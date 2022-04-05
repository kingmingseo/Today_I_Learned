x=c(1:10)
dotchart(x,label=paste("test",1:10),pch=22)


x=c(1,2,3,4,5,6,7,8,9)
y=x*2
z=x*3
plot(x,y,type="o",ylim=c(0,30))
points(x,z,pch="+")
lines(x,z,col="blue")
  dev.off()

  
b=c(1,2,1,4,3,5,4,5,3,2,5,6,7,2,8,5,9,5,3,5)
hist(b)
  