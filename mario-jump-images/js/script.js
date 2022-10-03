const mario = document.querySelector('.mario');
const pipe = document.querySelector('.pipe');

const jump = (() => {
    mario.classList.add('jump');
}, 500);

const loop = setInterval (() => {
    const pipePosition = pipe.offsetLeft;
    
    if (pipePosition <= 120){
        pipe.style.animation = 'none';
        pipe.style.animation = '${pipePosition}px';
    }
}, 10)