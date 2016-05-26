#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>


sem_t s,b,t; //special,blank,text semaphore
char str[100]; //문자열이 저장되어 있는 공간
int i;
int c; // c=str[i], 한 문자씩 담을 공간

void text(void* temp) {
    sem_wait(&t);
    printf("%c ",c);
    sem_post(&t);
}


void blank(void* temp) {
    sem_wait(&b);
    printf("%c ",c);
    sem_post(&b);
}

void special(void* temp) {
    sem_wait(&s);
    printf("%c ",c);
    sem_post(&s);
}

int main(int argc, char **argv) {
    
    int len; //텍스트 길이
    
    printf("문자 입력 :");
    fgets(str,sizeof(str),stdin);    //입력받은 문자열이 str로 들어감
    
    for(i=0;i<100;i++) {
        if(str[i]==0) {    //NULL이면
            len=i-1;
            break;
        }
    } // NULL앞까지 길이 자름
    
    pthread_t th_s,th_t,th_b;
    sem_open((char*)&s,0,0);
    sem_open((char*)&t,0,0);
    sem_open((char*)&b,0,0);  //세 개 세마포어 초기화
    pthread_create(&th_s,NULL,(void *)special,NULL);
    pthread_create(&th_t,NULL,(void *)text,NULL);
    pthread_create(&th_b,NULL,(void *)blank,NULL);  // thread 3개 생성
    
    
    
    for(i=0;i<len;i++) {
        
        c = str[i];
        
        if((c>=65 && c<=90) || (c>=97 && c<=122))
            sem_post(&t);    //텍스트인 경우
        
        if(c==32)
            sem_post(&b);    //공백인 경우
        
        if((c>=33 && c<=47) || (c>=58 && c<=64) || (c>=91 && c<=96) || (c>=123 && c<=126))
            sem_post(&s);    //특수문자인 경우
    }
    
    pthread_join(th_s,NULL);
    pthread_join(th_t,NULL);
    pthread_join(th_b,NULL);
    
    printf("\n");
    
    return 0;
}
