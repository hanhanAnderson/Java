% test gen_disk program for different parameter values
% N = 256,
% Hanhan ZHOU
% 02/06/2018
function disk_test

	N = 256
	colormap(gray(256))
	for R = 10 : 20: 100
		for type = 1:3
			A = gen_disk(N,type,R)
			image(A)
			pause
		end
	end

