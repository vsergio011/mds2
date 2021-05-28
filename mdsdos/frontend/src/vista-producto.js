import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaProducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }

				.btnFooter{
        			background-color: hsl(213deg 13% 41%);
        			border-radius:25px
        		}
            </style>
<vaadin-vertical-layout style="width: 100%; justify-content: center;">
 <vaadin-vertical-layout style="width: 100%; justify-content: center;">
  <label id="productLbl" style="align-self: center;"></label>
  <img src="https://www.mundofino.com/site/assets/files/1729/no_foto.600x600nw.jpg" id="imgProducto" style="align-self: center;">
  <vaadin-horizontal-layout style="align-self: center; justify-content: flex-start; background-color: #374453;">
   <vaadin-button id="moreInfoBtn" style="align-self: flex-start; margin: var(--lumo-space-xs);" class="btnFooter">
     ... 
   </vaadin-button>
   <vaadin-button id="addOffertaBtn" class="btnFooter" style="margin: var(--lumo-space-xs);">
     Anadir oferta 
   </vaadin-button>
   <vaadin-button id="quitarOfertaBtn" class="btnFooter" style="margin: var(--lumo-space-xs);">
     Quitar Oferta 
   </vaadin-button>
   <vaadin-button id="addCarritoBtn" style="border-radius:25px; margin: var(--lumo-space-xs); background-color: hsl(213deg 13% 41%); flex-grow: 0; flex-shrink: 0;" class="btnFooter">
     + 
   </vaadin-button>
   <label id="label" style="align-self: center; color: white;"></label>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-producto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProducto.is, VistaProducto);
