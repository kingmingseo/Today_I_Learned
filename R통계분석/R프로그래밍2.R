library(dplyr)
library(tidyr)
score= c(76, 79, 69 , 20,25, 39,98,58,68,96,55 )
which(score == 69)
which(score>= 85)
max(score)
which.max(score)
min(score)
which.min(score)



replacena=function(x){

  temp=which(x!="NA")
  temp_2=which(is.na(x))
  new_x=x[temp]
  new_x_mean=mean(new_x)
  x[temp_2]=new_x_mean
  return(x)
}
x=c(7,12,9,15,NA,8,14,2,9,NA,8)
replacena(x)

