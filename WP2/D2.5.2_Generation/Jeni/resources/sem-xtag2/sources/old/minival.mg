include header.mg
include TreeFragments.mg
include SyntFunctions.mg
include Diathesis.mg
include VerbFamilies.mg
include Punctuation.mg
include Modifiers.mg
include Conjunction.mg
include Comparatives.mg
include AdjectivesAdverbs.mg
include Prepositions.mg
include Lexicalization.mg
include Auxiliaries.mg
include Negation.mg
include Determiners.mg
 
 
% Modifiers
value betavxN

% Determiners
value betaDnx

% AdjectivesAdverbs
value betaAn

% Prepositions
value betavxPnx		
value betanxPnx

% Lexicalization
value alphaD	
value alphaNXN
value alphaPXPnx			% to handle "in which"
value alphaPronoun
value alphaRelativePronoun
value alphaInterrogativePronoun

% Auxiliaries
value betaVvx
value betaVvxTo		% to handle "to" in "bill wants to sleep"

% VerbFamilies
value n0V
value n0Vn1
value n0VPn1
value s0V
value s0Vn1		% to handle "dancing fascinates lisa"
value n0Vs1		% to handle "bill wants" in "bill wants to sleep" 


% TreeFragments
%value betaVn


% n0V -> dian0Vactive/Diathesis -> active/TreeFragments -> Subject/SyntFunctions -> CanSubject/TreeFragments