stack=function(){
  s=c()
  stack_size=0
  push=function(data){
    if(stack_size==20){stop("스택이 가득차있습니다.")}
    s<<-c(s,data)
    stack_size<<-stack_size+1
    
    
  }
  pop=function(){
    last=s[stack_size]
    s<<-s[-stack_size]
    stack_size<<-stack_size-1
    return(last)
  }
  size=function(){
    return(stack_size)
  }
  empty=function(){
    ifelse(stack_size==0,"스택이 비어있습니다","스택이 비어있지 않습니다")
    
  }
  full=function(){
    ifelse(stack_size==20,"스택이 가득 찼습니다","가득 차있지 않습니다")
 
    
  }
  
  print=function(){
    return(s)
  }
  return(list(print=print, push=push,size=size,pop=pop,empty=empty,full=full))
}