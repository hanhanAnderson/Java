% This is a function to generation,
% N  = number of rows and columns.
% type = 1 for Eucledian
%		 2 for city - block
%		 3 for checkerboard
% R = radius (of the disk)
% Hanhan ZHOU
% 2/6/2018
function A = gen_disk(N, type, R)
	
	A = zeros(N);

	for m = 1 : N

	if(m < N/2)
		m1 = m -1;	% convert from MatLAB index
	else 
		m1 = m -1 -N; % convert to negative index
	end

		for n = 1 : N
			if(n < N/2)
				n1 = n -1;	% convert from MatLAB index
			else 
				n1 = n -1 -N; % convert to negative index
			end
			switch type
				case 1 % Eucledian
					dist = sqrt (m1^2 + n1^2);
				case 2 % city - block
					dist = abs(m1)+ abs(n1);
				case 3 % checkerbox
					dist = max(abs(m1),abs(n1));
			end
			if (dist < R)
				A(m,n) = 255; 
			end
		end% end for N loop
		% calculate distance from origin
	end % end for M loop

% Create a disk and color to white
%colormap(gray(256))








