import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

class VistaComentariosproducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 25%;">
  <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 50%; padding: var(--lumo-space-l);">
   <label style="font-weight: bold; align-self: stretch; font-size:30px; ">Titulo del producto </label>
   <label style="align-self: stretch; ">Valoración media {5/5} </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 50%; flex-grow: 0; padding: var(--lumo-space-l);">
   <vaadin-button style="align-self: flex-end;">
    Añadir al carrito
   </vaadin-button>
   <vaadin-button style="align-self: flex-end;">
    Volver al producto
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="height: 100%; width: 100%; flex-wrap: wrap;">
  <vaadin-horizontal-layout style="height: 50%; width: 45%; margin: var(--lumo-space-m); padding: var(--lumo-space-m);">
   <vaadin-vertical-layout style="width: 50%; padding: var(--lumo-space-m);">
    <label style="align-self: stretch; ">Valoración 1, Usuario</label>
    <label style="align-self: stretch; ">Valoración 5/5 </label>
   </vaadin-vertical-layout>
   <vaadin-text-area style="align-self: stretch; width: 50%;">
    asdasdsadasdsad 
   </vaadin-text-area>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-comentariosproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaComentariosproducto.is, VistaComentariosproducto);
